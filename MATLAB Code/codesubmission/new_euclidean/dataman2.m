F = dir('*.egonet');

% load files
temp2= [];
for ii = 1:length(F)
   temp1 = load(F(ii).name);
end

%
% for ii = 1:length(F)
%   load(F(ii).name);
% end

% concatenate files
for ii = 1:26
   temp2 = [temp1; temp2];
end
temp = temp2(1:28680 , :);

mat= [aa];


output=[];
k=228;

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

for i = 1 : k
    if (mat(i,1) == j)
%     if (aa(i,2)== 0)
        u(mat(i,2),3)= mat(i,3);
%     end
    end
end

u1= u(j+1:k ,:);

output= [output ; u1];

end

o=output(:,3);

Z1 = linkage(o');
c = cluster(Z1,'maxclust',5);
hist(c);





