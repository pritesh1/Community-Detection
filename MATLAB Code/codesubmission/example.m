X = [0 0; 1 0 ; 1 1 ; 1 0; 1 1];
Y = pdist(X);
Z = linkage(Y);
c = cluster(Z,'maxclust',4);
