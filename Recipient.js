import React from 'react'; // Make sure to import React
import "./Recipient.css";

// Import images
import Women_logo from "./Images/Women_logo.jpg";
import logo from "./Images/logo.png";
import chat from "./Images/chat.png";
import report from "./Images/report.png";

export default function Recipient(props) {
  const { name, donatedCount, ratings, id, address, contactNumber, donorStatus } = props;

  return (
    <nav>
      <div className="profile">
        <img className="pic" src={Women_logo} alt="Profile" />
        <h3 className="head">About Profile</h3>
        <div className="Details">
          <div className="Donar-record">
            <div className="Donated">
              <p className="Don">{donatedCount}</p>
            </div>
            <p>Donated</p>
            <div className="Rating">
              <p className="r">{ratings}</p>
            </div>
            <p>Ratings</p>
          </div>
          <div className="Rec-details">
            <p>ID: {id}</p>
            <p>Name: {name}</p>
            <p>Address: {address}</p>
            <p>Contact Number: {contactNumber}</p>
            <p>Donor Status: {donorStatus}</p>
          </div>
        </div>
        <div className="Downbar">
          <div className="combo">
            <img className="Call" src={logo} alt="Call" />
            <button className="combo-button">Phone</button>
          </div>
          <div className="combo">
            <img className="chat" src={chat} alt="Chat" />
            <textarea className="combo-button1" type="Text" name="Chat" />
            <button className="combo-button">Chat</button>
          </div>
          <div className="combo">
            <img className="report" src={report} alt="Report" />
            <button className="combo-button">Report</button>
          </div>
        </div>
      </div>
    </nav>
  );
}
