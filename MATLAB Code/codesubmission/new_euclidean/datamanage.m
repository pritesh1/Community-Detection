F = dir('*.egonet');

% load files
temp2= [];
% for ii = 1:length(F)
%    temp1 = load(F(ii).name);
% end

 for ii = 1:length(F)
  load(F(ii).name);
end

% concatenate files
% for ii = 1:26
%    temp2 = [temp1; temp2];
% end
% temp = temp2(1:28680 , :);

output=[];

for j =1:228

u = zeros(228,1);

for i = 1 : 228
%     if (aa(i,2)== 0)
        u(i,1)=j;
        u(i,2)=i;
        u(i,3)=NaN;
%     end
end

w=u;
i=0;

for i = 1 : 228
    if (aa(i,1) == j)
%     if (aa(i,2)== 0)
        u(aa(i,2),3)= aa(i,3);
%     end
    end
end

u1= u(1:228 ,:);

output= [output ; u1];

 end

