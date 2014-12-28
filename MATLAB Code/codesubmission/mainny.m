%this code is used for arranging the data in a format which is suitable for
%clustering
%main
%output: 'circles' variable containing the different circles(groups of
%users)
clc;
clear all;
close all;
cd('new_euclidean\');
F = dir('*.egonet');
% load files
temp2= [];
for ii = 1:length(F)
    temp1 = load(F(ii).name);
end

%
for ii = 1:length(F)
    p{ii}= load(F(ii).name);
end

% concatenate files
for ii = 1:26
    temp2 = [temp1; temp2];
end
temp = temp2(1:28680 , :);
i=0;
circles={};
for num1=1:60
    if(num1~= 54 && num1~= 32 && num1 ~= 5 && num1~=4 &&num1~=7 &&num1~=9 &&num1~=10  &&num1~=11 && num1~=16 && num1~=17 && num1~=20  && num1~=25 &&num1~=26 && num1~=27 &&num1~=29 && num1~=30 && num1~=31 &&num1~=37 &&num1~=45 &&num1~=51 && num1~=60 && num1~=69 &&num1~=70)
        i=i+1;
        mat1= p{num1};
        circ1 =( min(mat1(:,1)):max(mat1(:,1))+1);
        [mat1 , c] = datamanpk(mat1);
        for tmp= 1:5
            ind = find(c==tmp);
            circles{i,tmp} = num2cell(circ1(ind));
            
        end
        c = c+5*(i-1);
        if(num1==1)
            cf=c;
        else
            cf =[cf; c];
        end
    end
%     if(i==5)
%         
%         break;
%     end
end
mat1 =p{1};
[mat1 , c] = datamanpk(mat1);
hist(c);
x= [1:5*(i)];
hist(cf,x);
title('Distribution of number of elements within each cluster using single linkage distance clustering','Fontsize',15);
xlabel('classes','Fontsize',15);
save('datacomplete','circles');