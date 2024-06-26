import React from "react";
import "./Navbar.css";
import {assets} from '../../assets/assets';
import { Link } from "react-router-dom";

const Navbar = ({ setSidebar }) => {
  return (
    <nav className="flex-div">
      <div className="nav-left flex-div">
        <img
          className="menu-icon"
          src={assets.menu_icon}
          alt=""
          onClick={() => setSidebar((prev) => (prev === false ? true : false))}
        />
       <Link to='/'> <img className="logo" src={assets.logo} alt="" /></Link>
      </div>
      <div className="nav-middle flex-div">
        <div className="search-box flex-div">
          <input type="text" placeholder="search" />
          <img src={assets.search_icon} alt="" />
        </div>
      </div>
      <div className="nav-right flex-div">
        <img src={assets.upload_icon} alt="" />
        <img src={assets.more_icon} alt="" />
        <img src={assets.notification_icon} alt="" />
        <img src={assets.jack} alt="" className="user-icon" />
      </div>
    </nav>
  );
};

export default Navbar;
