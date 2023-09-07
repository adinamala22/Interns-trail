import { Link } from "react-router-dom";
import "./Home.css";
import login from "./Images/login.png";
export default function Home() {
  return (
    <>
      <p className="Heading1">
        Welcome to mother's gift, life saver for infants.
      </p>
      <img className="login" src={login} alt="Nothing to show" />
      <p className="Paragraph">
        Mother's gift is a groundbreaking online platform decited to <br />
        bridging the gap between milk donors and infans and need <br />
        ensuring that every newborn has access to safe and nourishing <br />
        milk. This innovative website aims to create a lifeline for infants{" "}
        <br />
        enabling caring individuals to donate breast milk and health give
        <br />
        vulnerable babies the best start in life.
        <br />
        <br />
        <br />
      </p>
      <button className="Offer">
        <Link to="/Login" className="offer">
          Offer Mother's Milk
        </Link>
      </button>
      <button className="Offer">
        <Link to="/Login" className="offer">
          Nourish your child
        </Link>
      </button>
    </>
  );
}
