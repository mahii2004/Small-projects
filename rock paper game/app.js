let userScore = 0;
let compScore =0;
 const choices = document.querySelectorAll(".choice");
 const msg = document.querySelector("#msg");
 const userScorePara = document.querySelector("#userScore");
 const compScorePara = document.querySelector("#compScore");


 choices.forEach((choice)=>{

    choice.addEventListener("click",()=>{
        const userChoice = choice.getAttribute("id");
         
               palyGame(userChoice);
    })
 })


 function palyGame(userChoice)
 {
    const CompChoice = genCompChoice();

    if(userChoice==CompChoice)
    {
        drawGame();
    }
    else
    {
        let userWin = true;
        if(userChoice ="rock")
        {
            userWin = CompChoice =="paper"? false : true;

        }else if(userChoice="paper")
        {
            userWin = CompChoice=="scissors" ? false : true;
        }else{
            userWin = CompChoice=="rock" ? false : true;
        } 

        showWinner(userWin,userChoice,CompChoice);

    }
 }

  function showWinner(userWin,userChoice,CompChoice)
 {
    if(userWin){
        userScore++;
        userScorePara.innerText=userScore;
       msg.innerText = `You win! your ${userChoice} beats ${CompChoice}`;
       msg.style.backgroundColor = "green";
    }
    else{
        compScore++;
        compScorePara.innerText=compScore;
        msg.innerText = `You lose. ${CompChoice} beats your ${userChoice}`;
        msg.style.backgroundColor = "red";
    }
 }

function drawGame()
{
   
    msg.innerText = "game was draw. play again.";
    msg.style.backgroundColor = "#081b31";
}
 function genCompChoice()
 {
    const options = ["rock" , "paper" , "scissors"];
    const randIdx = Math.floor(Math.random()*3);
    return options[randIdx];
 }


