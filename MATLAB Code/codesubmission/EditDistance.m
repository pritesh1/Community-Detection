function [edit] = EditDistance(string1,string2)

a= string1;
b= string2;

lena= length(a);
lenb= length(b);


if (lena>lenb)
    temp1=a;
    a=b;
    b=temp1;
    
    temp1=lena;
    lena=lenb;
    lenb=temp1;
end


edit=0;

for i = 2 :lena;
    temp = a{i};
    count = 0;
    for j= 2:lenb;
        if (strcmp(temp , b{j}))
            count= count + 1;
        end
    end
    if (count==0)
        edit= edit+1;
    end
    
end

edit= edit + abs(lena-lenb);

if (lena==0  || lenb==0)
        edit=10000;
end

