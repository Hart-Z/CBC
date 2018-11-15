function isUnique(str){
    var pool = 0;
    for(let i=0 ; i<str.length;i++)
    {
        let temp = str[i].charCodeAt()-'a'.charCodeAt();
        if((pool&(1<<temp))>0)
            return false;
        else
            pool|=1<<temp;
    }
    return true;

}

console.log(isUnique('abcdefg'));
console.log(isUnique('abadefg'));