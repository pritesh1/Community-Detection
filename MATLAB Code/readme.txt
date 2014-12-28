In this project we have 4 main files:

1)mainny:used to calculate the proximity matrix between different nodes in the graph.
       Each node of the graph represents a user.Greater the proximity distance, the user's are more similar
	This function also clusters the users into 'circles' or groups

2)datamanpk: As there are multiple files, this function is called multiple times from the 'mainny' function. It clusters the users
             which are present in one file

3)readtext: Takes the user defined circles and stores them cell arrays. Basically takes the data from the text file and arranges
            it in a cell array fashion

4)editmain: used to calculate the edit distance between user defined ground truth circles and the circles we calculated



Running comments:
Set the main directory to 'codesubmission' folder.
Run mainny first. Observe the graph of no.of users vs clusters
Run edit distance: Change the current directory again to the codesubmission folder and run this function




The egonets files contain data of each users individual egonet or a set of each user's friends
The training folder contains circles defined by the user.
The new_egonents contains data of the distance between 2 users




The code is tested and runs without any errors. 
Note: All errors that may occur are because the correct folder is not set as the current directory.