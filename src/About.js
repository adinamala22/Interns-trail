import { Link } from "react-router-dom";
export default function About() {
  return (
    <>
      <main>
        <h1>Cricket is my favourite.</h1>
        <p>Impossible is also possible</p>
      </main>
      <nav>
        <Link to="/H">Home</Link>
      </nav>
    </>
  );
}
