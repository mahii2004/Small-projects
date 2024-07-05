import React from 'react'
import './Skill.css'
import UiDesign from '../../assets/ui-design.png'
import webDesign from '../../assets/website-design.png'
import AppDesign from '../../assets/app-design.png';
const Skill = () => {
  return (
    <div>
      <section id='skills'>
        <span className='skillTitle'> What i do</span>
        <span className='skillDescription'>i am skilled and passionate web developer with strong knowledge about frontend and backend technologies like java, springboot, react, javascript, html&css,mysql. </span>
        <div className='skillBars'>
            <div className='skillBar'>
                <img className='skillImg' src= {webDesign} alt=''/>
                <div className='skillText'>
                    <h2>Frontend</h2>
                    <p> I can develop user-friendly frontend part for a website by using html&css, javascript,rect.js techonolgies  </p>
                </div>
            </div>
            <div className='skillBar'>
                <img className='skillImg' src={UiDesign} alt=''/>
                <div className='skillText'>
                    <h2>Backend</h2>
                    <p>I can write the clean backend code and create simple api's for a website using java , Springboot.  </p>
                </div>
            </div>
            <div className='skillBar'>
                <img className='skillImg' src={AppDesign} alt=''/>
                <div className='skillText'>
                    <h2>FullStack</h2>
                    <p>I can develop both frontend and backend by integration of database. from start to end ,i can develop a full website.</p>
                </div>
            </div>
        </div>
      </section>
    </div>
  )
}

export default Skill
