<!DOCTYPE html>
<html lang="en">
<head>
    <title>Room Book</title>
    <style>
        body{
            display: flex;
            margin-top: 50px;
            margin-bottom: 50px;
            justify-content: center;
            background-color:#000;
            background-size: cover;
        }
        div.border{
            background-color: #fff;
            border:2px solid blue;
            margin-top: 20px;
            padding:30px
        }
        div.elem-group {
  margin: 20px 0;
}
div.elem-group.inlined {
  width: 49%;
  display: inline-block;
  float: left;
  margin-left: 1%;
}

    </style>
</head>
<body>
    <div class="border">
    <form>
        <div class="elem-group">
          <label for="name">Your Name: </label>
          <input type="text" id="name" name="visitor_name" placeholder="abc" required>
        </div>
        <div class="elem-group">
          <label for="email">Your E-mail: </label>
          <input type="email" id="email" name="visitor_email" placeholder="xyz.12@email.com" required>
        </div>
        <div class="elem-group">
          <label for="phone">Your Phone: </label>
          <input type="tel" id="phone" name="visitor_phone" placeholder="9123456789" required>
        </div>
        <hr>
        <div class="elem-group inlined">
          <label for="adult">Adults</label>
          <input type="number" id="adult" name="total_adults" placeholder="2" min="1" required>
        </div>
        <div class="elem-group inlined">
          <label for="child">Children</label>
          <input type="number" id="child" name="total_children" placeholder="2" min="0" required>
        </div>
        <div class="elem-group inlined">
          <label for="checkin-date">Check-in Date</label>
          <input type="date" id="checkin-date" name="checkin" required>
        </div>
        <div class="elem-group inlined">
          <label for="checkout-date">Check-out Date</label>
          <input type="date" id="checkout-date" name="checkout" required>
        </div>
        <div class="elem-group">
          <label for="room-selection">Select Room Preference</label>
          <select id="room-selection" name="room_preference" required>
              <option value="">Choose a Room from the List</option>
              <option value="one">Single</option>
              <option value="Two">Two BHK</option>
              <option value="Three">Three BHK</option>
          </select>
        </div>
        <hr>
        <div class="elem-group">
            <label for="Payment">Payment: </label>
            <select id="payment" name="Payment" required>
                <option value="">Choose a Payment option from the List</option>
                <option value="one">Card</option>
                <option value="Two">Online</option>
                <option value="Three">Paypal</option>
            </select>
        </div>
        <button type="submit">Book The Rooms</button>
      </form>
    </div>
</body>
</html>