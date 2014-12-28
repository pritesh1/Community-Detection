%calculates the proximity matrix and clusters the users into circles. 
%All this is done for one file
function [mat , c] = datamanpk(mat1)

mat= mat1;
minus = min(min(mat(:,1:2)))-1;
size1= size(mat);

for i= 1:size1(1)
mat(i,1)=mat1(i,1)-minus;
mat(i,2)=mat1(i,2)-minus;
end

output=[];
l=1;
k1=mat(size(mat));
k=k1(1);

for j =1:k

u = zeros(k,1);

for i = 1 : k
%     if (aa(i,2)== 0)
        u(i,1)=j;
        u(i,2)=i;
        u(i,3)=NaN;
%     end
end

w=u;
i=0;
% 
for i = 1 : size(mat,1)
    if (mat(i,1) == j)
            %     if (aa(i,2)== 0)
            for st =1:k
                if(mat(i,2)==u(st,2))
                    u(st,3)= mat(i,3);
                end
            end
            %             u(mat(i,2),3)= mat(i,3);
            %     end
        end
end
   %pritesh      
%     for i = 1 : k %size(mat)
%         if (mat(i,1) == j)
%             
%                         u(mat(i,2),3)= mat(i,3);
% %                 
%         end
%     end
u1= u(j+1:k ,:);

output= [output ; u1];

end

o=output(:,3);
Z1 = linkage(o');
c = cluster(Z1,'maxclust',5);

