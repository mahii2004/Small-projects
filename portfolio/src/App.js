import Navbar from "./components/Navbar/Navbar";
import Intro from "./components/intro/Intro";
import Skill from "./components/Skills/Skill";
import Projects from "./components/projects/Projects";
import Contact from "./components/Contact/Contact";
import Footer from "./components/Footer/Footer";
function App() {
  return (
    <div className="App">
      <Navbar/>
      <Intro/>
      <Skill/>
      <Projects/>
      <Contact/>
      <Footer/>
    </div>
  );
}

export default App;
