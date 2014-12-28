clc;
clear all;
close all;
addpath('C:\Users\Admin\Desktop\data mining_before_presentation\data mining_before_presentation\data mining\Data Mining\new_euclidean\');
F = dir('*.egonet');

% load files
temp2= [];
for ii = 1:length(F)
   temp1 = load(F(ii).name);
end

%
for ii = 1:length(F)
  load(F(ii).name);
end

% concatenate files
for ii = 1:26
   temp2 = [temp1; temp2];
end
temp = temp2(1:28680 , :);

mat1= [aa];


mat= mat1;  % mat1 is the reduced matrix
minus = mat(1,1)-1; %find out the element to be subtracted to find the reduced matrix
size1= size(mat); 

for i= 1:size1(1)  
mat(i,1)=mat1(i,1)-minus;
mat(i,2)=mat1(i,2)-minus;
end

output=[];
l=1;
%k1 is the it is the final element of column 1
% k1=mat(size(mat));
% k=k1(1)
k= max(max(mat(:,1:2)));
for j =1:k   % for scanning each element and assigning distances from each element to other elements
    
    u = zeros(k,1);  %%create an array for storing the pdist
    
    for i = 1 : k                 %% creating an array like: [1:2 , 1:3,...1:n ; 2:1...2:n..,n:1,n:n]
        %     if (aa(i,2)== 0)    
        u(i,1)=j;
        u(i,2)=i;
        u(i,3)=NaN;
        %     end
    end
    
    w=u;
    i=0;
    
%     for i = 1 : size(mat)
%         if (mat(i,1) == j)
%             %     if (aa(i,2)== 0)
%             for st =1:k
%                 if(mat(i,2)==u(st,2))
%                     u(st,3)= mat(i,3);
%                 end
%             end
%             %             u(mat(i,2),3)= mat(i,3);
%             %     end
%         end
%     end
    
     %pritesh      
    for i = 1 : k %size(mat)
        if (mat(i,1) == j)
            
                        u(mat(i,2),3)= mat(i,3);
%                 
        end
    end
    u1= u(j+1:k ,:);   %% creating an array like: 
    
    output= [output ; u1];
    
end

o=output(:,3);

Z1 = linkage(o');
% H=dendrogram(Z1);
c = cluster(Z1,'maxclust',5);
hist(c,[1 2 3 4 5]);





