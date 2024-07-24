import React from "react";
import './projects.css'
import project1 from "../../assets/project1.png";
import project2 from "../../assets/project2.png";
import project3 from "../../assets/project3.png";
import project4 from "../../assets/project4.png";
const Projects = () => {
  return (
    <div>
      <section id="projects">
        <span className="skillTitle"> My Projects</span>
        <span className="skillDescription">
          I developed some real time projects with excellent user-friendly
          interfaces and clean backend code. <br /> Here is some of my projects
          and you can check my projects through linkedin and github{" "}
        </span>
        <div className="links">
          <a href="https://www.linkedin.com/in/mahendra-dadibathina-0417751b1?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app">
            Linkedin
          </a>{" "} 
          <a href="https://github.com/mahii2004">GitHub</a>
        </div>

        <div className="skillBars">
          <div className="skillBar">
            <img className="skillImg" src={project1} alt="" />
            <div className="skillText">
              <h2>User Management System</h2>
              <p>In this project, we can add, delete, edit the user details </p>
            </div>
          </div>
          <div className="skillBar">
            <img className="skillImg" src={project2} alt="" />
            <div className="skillText">
              <h2>Food Delivery</h2>
              <p>
               In this project ,we can see the menu according to our taste and add them to the cart then we can place the order 
              </p>
            </div>
          </div>
          <div className="skillBar">
            <img className="skillImg" src={project3} alt="" />
            <div className="skillText">
              <h2>Youtube Clone</h2>
              <p>
                This project is the clone of youtube , it was made by youtube official api 
              </p>
            </div>
          </div>
          <div className="skillBar">
            <img className="skillImg" src={project4} alt="" />
            <div className="skillText">
              <h2>Rock paper game</h2>
              <p>
                This is game, we can play the rock paper scissor game and check the score
              </p>
            </div>
          </div>
        </div>
      </section>
    </div>
  );
};

export default Projects;
