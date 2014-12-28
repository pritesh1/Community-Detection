%code used for finding the edit distance between circles which are
%calculated and the groound truth circles marked by the user

clear all;
clc;

load('data1.mat')
load('dataprocessed1.mat');

for k=1:size(circles,1)
    for h=1:size(circles,2)
        for i=1:size(op1,1)
            for j=1:size(op1,2)
                if(isempty(op1{i,j}))
                    continue;
                else
                    edit(i,j,k,h) = EditDistance(op1{i,j},circles{k,h});
                    if (edit(i,j,k,h)==0)
                        edit(i,j,k,h)= 1000;   %%assign a large number to outliers
                    end
                    
                end
            end
        end
    end
end
% save('editdistances','edit');

% calculating the minimum edit distances
% clc;
% clear all;
% load('editdistances.mat');
 c=find(edit == 0);
 
edit(c)=1111;    %%assign a large number to outliers
cnt=0;
for  i=1:size(edit,3)
    for j=1:size(edit,4)
          cost(i,j)=14*min(min(edit(:,:,i,j)));
    end
end
disp('editdistance calculated for single linkage clustering');
sum(sum((cost(:,2))))

