import React, { useState } from 'react'
import './home.css';
import Header from '../../componenets/header/Header';
import ExploreMenu from '../../componenets/exploreMenu/ExploreMenu';
import FoodDisplay from '../../FoodDisplay/FoodDisplay';
import AppDownload from '../../componenets/AppDownload/AppDownload';

const Home = () => {
  const [category,setCategory] = useState("All");

  return (
    <div>
      <Header/>
      <ExploreMenu category={category} setCategory={setCategory}/>
      <FoodDisplay category={category}/>
      <AppDownload/>
    </div>
  )
}

export default Home
