import os
loading = 1 # boolean used to turn comments on and off

def test_duplicates():
    if loading == 1:
        print("beginning duplicates test...")
    rmcmd = 'rm output.txt' # used for cleanup at the end
    curlcmd = 'curl -s 0.0.0.0:80 -w "\n" >> output.txt' # silently accesses our website via curl and appends each line to output.txt
    for i in range(1000): # gets 1000 random numbers from website
        os.system(curlcmd)
    # code modified from https://stackoverflow.com/questions/12937797/how-can-i-find-duplicate-lines-in-a-text-file-and-print-them
    counter = 0
    with open('output.txt') as f:
        seen = set()
        for line in f:
            line_lower = line.lower()
            if line_lower in seen:
                counter = counter + 1
            else:
                seen.add(line_lower)
    # end modified code

    assert counter <= 250, ("Too many duplicates: ", counter) #checking that there arent more than 250 duplicates
    if loading == 1:
        print("ending test...num duplicates: ", counter)
    os.system(rmcmd) # cleaning up for next run

if __name__ == "__main__":
    for i in range(10): # executes test 10 times
        test_duplicates()
    print("Everything passed") # verifies that test passed
