import "./App.css";
import Home from "./Home";
import About from "./About";
import Login from "./Login";
import { Route, Routes } from "react-router-dom";
import Navbar from "./Components/Navbar";
function App() {
  return (
    <div className="App">
      <Navbar />
      <Routes>
        <Route path="/H" element={<Home />} />
        <Route path="aboutus" element={<About />} />
        <Route path="login" element={<Login />} />
      </Routes>
    </div>
  );
}

export default App;
