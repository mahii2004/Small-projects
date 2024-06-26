export const API_KEY = 'AIzaSyDUNRmEWEpCP-nyMEfuntR9KsMYTFNZUq4';

export const valueConverter = (value)=>{
   if(value>=1000000){
    return Math.floor(value/1000000) +'M';
   }
   else if(value>=1000){
    return  Math.floor(value/1000) +'k'
   }
   else{
    return value;
   }
}