function [ op1 ] = testextract( textarray )

% for j=1:size(textarray,1)
%     arr1= testSet_users_friends{j};
    cnt=0;
    temparr = [];
    i=1;
    arr1=textarray;
    while(i <= length(arr1) )
        if( arr1(i) == ' ' ||  arr1(i) == ':' )
            while(i<= length(arr1))
                if( arr1(i) ~= ' ' &&  arr1(i) ~= ':' )
                    cnt=cnt+1;
                    testarray{cnt}=temparr;
                    temparr = [];
                    break;
                else
                    i=i+1;
                end
            end
        end
        temparr=[temparr , arr1(i) ];
        i=i+1; 
    end
% end
op1= testarray;