import React from 'react'
import './Intro.css'
import bg from '../../assets/profile.jpg'
import { Link } from 'react-scroll'
import btnImg from '../../assets/hireme.png'

const Intro = () => {
  return (
     <section id='intro'>
       <div className='introContent'>
        <span className='hello'> Hello,</span>
        <span className='introText'> I'm <span className='introName'>Mahendra Dadibathina</span><br/>Web Developer</span>
        <p className='introPara'>i am a passionate web Developer in creating visually appearing <br/> and user-friendly websites </p>
        <Link><button className='btn' onClick={()=>{
      document.getElementById('contact').scrollIntoView({behavior:'smooth'});
    }}><img src={btnImg} alt='' className='btnImg' />Hire me</button></Link>
       </div>
       <img src={bg} alt=' ' className='bg'/>

     </section>
  )
}

export default Intro
