import { Link } from "react-router-dom";
import symbol from "../Images/symbol.png";
export default function Navbar() {
  return (
    <>
      <nav className="navbar">
        <div className="sample-div">
          <img className="symbol" src={symbol} alt="Nothing to show" />
          <p className="title">Safe . Trusted . Lifesaving</p>
        </div>
        <div className="right-nav">
          {" "}
          <li>
            <Link to="/H" className="active-link">
              Home
            </Link>
          </li>
          <li>
            <Link to="/aboutus" className="active-link">
              Contact
            </Link>
          </li>
          <li>
            <Link to="/aboutus" className="active-link">
              Contribute milk
            </Link>
          </li>
          <li>
            <Link to="/aboutus" className="active-link">
              Request milk
            </Link>
          </li>
          <button>
            <Link to="/login" className="button1">
              Login
            </Link>
          </button>
        </div>
      </nav>
    </>
  );
}
