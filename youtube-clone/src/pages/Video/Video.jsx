import React from 'react'
import './Video.css'
import Playvideo from '../../components/Playvideo/Playvideo'
import Recomended from '../../components/Recomended/Recomended'
import { useParams } from 'react-router-dom'
const Video = () => {
  const {videoId,categoryId} =useParams();
  return (
    <div className='play-container'>
      <Playvideo />
      <Recomended categoryId={categoryId}/>
    </div>
  )
}

export default Video
