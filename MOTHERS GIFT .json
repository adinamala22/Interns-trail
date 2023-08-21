{
  "tables": {
    "Sign_UP": {
      "User_Id": "integer [primary Key]",
      "Account_type": "varchar",
      "User_name": "varchar",
      "password": "varchar",
      "created_at": "timestamp",
      "created_by": "varchar"
    },
    "User_Details": {
      "User_Id_Details": "integer [ref: - Sign_UP.User_Id]",
      "Role": "varchar [ref: - Sign_UP.Account_type]",
      "Name": "varchar",
      "Aadhaar_No": "varchar(12)",
      "Age": "integer",
      "E_mail": "varchar",
      "Contact": "varchar(13)",
      "Address": "varchar",
      "Doctors_Certificate": "document",
      "Baby_Age": "integer",
      "Medical_prescription": "document",
      "created_at": "timestamp",
      "created_by": "varchar",
      "updated_at": "timestamp",
      "updated_by": "varchar"
    },
    "Ratings": {
      "Rating_Id": "integer [primary key]",
      "User_Id": "integer [ref: - Sign_UP.User_Id]",
      "Ratings": "integer",
      "Feedback": "varchar",
      "created_at": "timestamp",
      "created_by": "varchar"
    },
    "Conversation": {
      "Conver_Id": "integer [primary key]",
      "Sender_Id": "integer [ref: - Sign_UP.User_Id]",
      "Receiver_Id": "integer [ref: - Sign_UP.User_Id]",
      "Message_content": "varchar",
      "Created_at": "timestamp",
      "Created_by": "varchar",
      "Updated_at": "timestamp",
      "Updated_by": "varchar"
    },
    "Milk_Donation_Listings": {
      "Don_List_Id": "integer [primary key]",
      "User_Id": "integer [ref: - Sign_UP.User_Id]",
      "Availability": "varchar",
      "created_by": "varchar"
    },
    "Notification": {
      "Notify_Id": "integer [ref: - Conversation.Conver_Id]",
      "User_Id": "integer [ref: - Sign_UP.User_Id]",
      "Message": "varchar",
      "Created_at": "timestamp",
      "Created_by": "varchar",
      "Updated_at": "timestamp",
      "Updated_by": "varchar"
    }
  }
}
