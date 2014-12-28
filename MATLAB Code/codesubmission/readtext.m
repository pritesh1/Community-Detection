%this code is used for reading the text data file which contains users and
%their circles, extracting each of the users from their respective circles
%and storing them in a matrix
close all;
clear all;
clc;
addpath('C:\Users\Admin\Desktop\data mining_before_presentation\data mining_before_presentation\data mining\Data Mining\new_euclidean\');
addpath('C:\Users\Admin\Desktop\data mining_before_presentation\data mining_before_presentation\data mining\Data Mining\');

F = dir('C:\Users\Admin\Desktop\data mining_before_presentation\data mining_before_presentation\data mining\Data Mining\Training\*.circles');
% load files
temp2= [];
for ii = 1:length(F)
    fid = fopen(F(ii).name);
% fid = fopen('C:\Users\Admin\Desktop\data mining_before_presentation\data mining_before_presentation\data mining\Data Mining\Training\26492.circles');
cnt=0;
while (1)
   % disp(tline)
    tline = fgets(fid);
    cnt=cnt+1;
    if(tline==-1)
        break;
    end
    [ op1{ii,cnt} ] = testextract(tline); 
end
fclose(fid);
end