%  X1= [1,0.9,0.10,0.65,0.2;0.9,1,0.70,0.60,0.50;0.1,0.7,1,0.4,0.3;0.65,0.6,0.4,1,0.8;0.2,0.5,0.3,0.8,1];
%  X1= 1./X1 ;

 X1= [0.9 0.1 0.65 0.2 0.7 0.6 0.5 0.4 0.3 0.8];
 
 %  X1 = X1*9;
% % D = pdist(X1);
 D = X1;
Z = linkage(1./X1,'median');
figure,
H = dendrogram(Z);
title('Single linkage clustering using median distance between clusters ','Fontsize',15);
xlabel('Nodes','Fontsize',15);