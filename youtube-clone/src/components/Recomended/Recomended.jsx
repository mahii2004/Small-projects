import React, { useEffect, useState } from "react";
import "./Recomended.css";
import { Link } from "react-router-dom";
import { API_KEY, valueConverter } from "../../data";

const Recomended = ({ categoryId }) => {
  const [apiData, setApiData] = useState([]);
  const fetchData = async () => {
    const realted_url = ` https://youtube.googleapis.com/youtube/v3/videos?part=snippet%2CcontentDetails%2Cstatistics&chart=mostPopular&maxResults=45&regionCode=IN&videoCategoryId=${categoryId}&key=${API_KEY}`;
    await fetch(realted_url)
      .then((res) => res.json())
      .then((data) => setApiData(data.items));
  };

useEffect(()=>{
  fetchData();
},[])

  return (

   
    <div className="recomended">
    {
      apiData.map((item,index)=>{
        return(
          <Link to={`/video/${item.snippet.categoryId}/${item.id}`} className="side-video-list" key={index}>
          <img src={item.snippet.thumbnails.medium.url} alt="" />
          <div className="vid-info">
            <h4>{item.snippet.title.slice(0,50)}</h4>
            <p>{item.snippet.channelTitle}</p>
            <p>{valueConverter(item.statistics.viewCount)} Views </p>
          </div>
        </Link>
        );
      })
    }
     
       </div>
  );
};

export default Recomended;
