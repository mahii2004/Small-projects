import React, { useState } from "react";
import "./Navbar.css";
import logo from "../../assets/logo.png";
import contact from "../../assets/contact.png";
import { Link } from "react-scroll";
import menu from '../../assets/menu.png'
const Navbar = () => {
  const [showMenu , setShowMenu] = useState(false);
  return (
    <nav className="navbar">
      <img src={logo} alt="" className="logo" />
      <div className="desktopMenu">
        <Link
          activeClass="active"
          to="intro"
          spy={true}
          smooth={true}
          offset={-100}
          className="desktopMenuList"
        >
          Home
        </Link>
        <Link
          activeClass="active"
          to="skills"
          spy={true}
          smooth={true}
          offset={-80}
          className="desktopMenuList"
        >
          About
        </Link>
        <Link
          activeClass="active"
          to="projects"
          spy={true}
          smooth={true}
          offset={-80}
          className="desktopMenuList"
        >
          projects
        </Link>
      </div>
      <button
        className="desktopMenuBtn"
        onClick={() => {
          document
            .getElementById("contact")
            .scrollIntoView({ behavior: "smooth" });
        }}
      >
        <img src={contact} alt="" className="desktopMenuImg" />
        Contact Me
      </button>
      <img src={menu} alt="" className="menu" onClick={()=>setShowMenu(!showMenu)}/>
      <div className="navMenu" style={{display: showMenu? "flex":"none"}}>
        <Link
          activeClass="active"
          to="intro"
          spy={true}
          smooth={true}
          offset={-100}
          className="ListItem"
          onClick={()=>setShowMenu(false)}
        >
          Home
        </Link>
        <Link
          activeClass="active"
          to="skills"
          spy={true}
          smooth={true}
          offset={-80}
          className="ListItem"
          onClick={()=>setShowMenu(false)}
        >
          About
        </Link>
        <Link
          activeClass="active"
          to="projects"
          spy={true}
          smooth={true}
          offset={-80}
          className="ListItem"
          onClick={()=>setShowMenu(false)}
        >
          projects
        </Link>
        <Link
          activeClass="active"
          to="contact"
          spy={true}
          smooth={true}
          offset={-100}
          className="ListItem"
          onClick={()=>setShowMenu(false)}
        >
          Contact
        </Link>
      </div>
    </nav>
  );
};

export default Navbar;
