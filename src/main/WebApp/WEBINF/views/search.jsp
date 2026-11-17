<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Search Flights | SkyBook</title>

    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Segoe UI', Arial, sans-serif;
        }

        body {
            min-height: 100vh;
            background: linear-gradient(135deg, #101c3a, #243b67);
            display: flex;
            align-items: center;
            justify-content: center;
            padding: 20px;
        }

        .booking-container {
            width: 100%;
            max-width: 850px;
            background: #ffffff;
            border-radius: 18px;
            overflow: hidden;
            box-shadow: 0 20px 50px rgba(0, 0, 0, 0.25);
        }

        .header {
            background: linear-gradient(120deg, #2563eb, #4f46e5);
            color: white;
            padding: 35px 40px;
        }

        .header h1 {
            font-size: 30px;
            margin-bottom: 10px;
        }

        .header p {
            font-size: 15px;
            color: #e0e7ff;
        }

        .form-section {
            padding: 40px;
        }

        .form-section h2 {
            font-size: 22px;
            color: #1e293b;
            margin-bottom: 10px;
        }

        .description {
            color: #64748b;
            margin-bottom: 30px;
            font-size: 14px;
        }

        .form-group {
            margin-bottom: 25px;
        }

        .form-group label {
            display: block;
            color: #334155;
            font-weight: 600;
            margin-bottom: 10px;
            font-size: 14px;
        }

        .form-group input {
            width: 100%;
            padding: 15px;
            border: 1px solid #cbd5e1;
            border-radius: 9px;
            font-size: 15px;
            outline: none;
            transition: 0.3s;
        }

        .form-group input:focus {
            border-color: #2563eb;
            box-shadow: 0 0 0 3px rgba(37, 99, 235, 0.12);
        }

        .submit-btn {
            width: 100%;
            padding: 16px;
            border: none;
            border-radius: 9px;
            background: linear-gradient(120deg, #2563eb, #4f46e5);
            color: white;
            font-size: 16px;
            font-weight: 600;
            cursor: pointer;
            transition: 0.3s;
        }

        .submit-btn:hover {
            transform: translateY(-2px);
            box-shadow: 0 8px 20px rgba(37, 99, 235, 0.3);
        }

        .footer {
            text-align: center;
            padding: 18px;
            background: #f8fafc;
            color: #64748b;
            font-size: 13px;
        }

        @media (max-width: 600px) {
            .header, .form-section {
                padding: 25px;
            }

            .header h1 {
                font-size: 24px;
            }
        }
    </style>
</head>

<body>

    <div class="booking-container">

        <div class="header">
            <h1>✈ SkyBook</h1>
            <p>Your journey begins with the right flight.</p>
        </div>

        <div class="form-section">

            <h2>Search Flights</h2>
            <p class="description">
                Enter your travel details to find available flights.
            </p>

            <form action="/searchFlights"
                  method="post">

                <div class="form-group">
                    <label for="source">SOURCE</label>
                    <input
                        type="text"
                        id="source"
                        name="source"
                        placeholder="Enter departure city"
                        required>
                </div>

                <div class="form-group">
                    <label for="destination">DESTINATION</label>
                    <input
                        type="text"
                        id="destination"
                        name="destination"
                        placeholder="Enter destination city"
                        required>
                </div>

                <button type="submit" class="submit-btn">
                    Search Flights →
                </button>

            </form>

        </div>

        <div class="footer">
            © 2026 SkyBook. All rights reserved.
        </div>

    </div>

</body>
</html>
