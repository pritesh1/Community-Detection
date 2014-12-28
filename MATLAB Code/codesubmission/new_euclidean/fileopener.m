%The file for finding out clusters
%Function: This function extracts data from the format of users and 
%corresponding distances
%The Clustering used: Agglomerative Heirarchical: Single Linkage
%Authors:
%The Mining Minion Team: Fall 2015

F = dir('*.egonet');

% load files
temp2= [];
for ii = 1:length(F)
   temp1 = load(F(ii).name);
end

% for ii = 1:length(F)
% load(F(ii).name);
% end

% concatenate files
for ii = 40:70
   temp2 = [temp1; temp2];
end
% temp = temp2(1:28680 , :);


%generate the  number for compatibility with the linkage function
 p=size(temp2);
 A=[1 -1 -2*p(1)];
 s= roots(A);
 s(1)=floor(s(1));
 jo= (s(1)*(s(1)-1))/2;
 
 temp = temp2(1:jo , :);
 output = temp2(1:jo , 3);
 
 %Finding the link Matrix
 Z1 = linkage(output);
 
 %Generating the output clusters
 c = cluster(Z1,'maxclust',10);
 figure,hist(c)

 
