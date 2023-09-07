import "./Login.css";
import donor from "./Images/donor.png";
export default function Login() {
  return (
    <>
      <main>
        <h1 className="topic">Choose Account Type</h1>
      </main>
      <nav>
        <div className="donor">
          <div className="image">
            <img className="first-img" src={donor} alt="Nothing" />
            <div className="donor-light">
              
            </div>
          </div>
        </div>
      </nav>
    </>
  );
}
