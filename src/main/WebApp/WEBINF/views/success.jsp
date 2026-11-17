
<%@ page import="com.flightbookingApplication.learnl19.Entity.Flight" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Flight Search Results | SkyBook</title>

    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Segoe UI', Arial, sans-serif;
        }

        body {
            min-height: 100vh;
            background: #f1f5f9;
            padding: 40px 20px;
        }

        .container {
            max-width: 1000px;
            margin: auto;
            background: white;
            border-radius: 15px;
            overflow: hidden;
            box-shadow: 0 10px 30px rgba(0,0,0,0.08);
        }

        .header {
            background: linear-gradient(120deg, #2563eb, #4f46e5);
            color: white;
            padding: 30px 35px;
        }

        .header h1 {
            font-size: 28px;
            margin-bottom: 8px;
        }

        .header p {
            color: #dbeafe;
            font-size: 14px;
        }

        .content {
            padding: 35px;
        }

        .content h2 {
            color: #1e293b;
            margin-bottom: 8px;
        }

        .subtitle {
            color: #64748b;
            margin-bottom: 25px;
            font-size: 14px;
        }

        .flight-table {
            width: 100%;
            border-collapse: collapse;
        }

        .flight-table th {
            background: #eff6ff;
            color: #1e40af;
            text-align: left;
            padding: 16px;
            font-size: 14px;
        }

        .flight-table td {
            padding: 17px 16px;
            border-bottom: 1px solid #e2e8f0;
            color: #334155;
            font-size: 14px;
        }

        .flight-table tr:hover {
            background: #f8fafc;
        }

        .flight-number {
            color: #2563eb;
            font-weight: 700;
        }

        .status {
            background: #dcfce7;
            color: #15803d;
            padding: 6px 12px;
            border-radius: 20px;
            font-size: 12px;
            font-weight: 600;
        }

        .no-flights {
            text-align: center;
            padding: 35px;
            color: #64748b;
            background: #f8fafc;
            border-radius: 10px;
        }

        .back-btn {
            display: inline-block;
            margin-top: 25px;
            padding: 12px 22px;
            background: #2563eb;
            color: white;
            text-decoration: none;
            border-radius: 8px;
            font-size: 14px;
            font-weight: 600;
            transition: 0.3s;
        }

        .back-btn:hover {
            background: #1d4ed8;
        }

        .footer {
            text-align: center;
            padding: 18px;
            background: #f8fafc;
            color: #64748b;
            font-size: 13px;
        }

        @media(max-width: 600px) {
            .content {
                padding: 20px;
                overflow-x: auto;
            }

            .header {
                padding: 25px;
            }

            .flight-table {
                min-width: 550px;
            }
        }
    </style>
</head>

<body>

<%
    List<Flight> listOfFlight =
        (List<Flight>) request.getAttribute("listofsearchFlights");
%>

<div class="container">

    <div class="header">
        <h1>✈ SkyBook</h1>
        <p>Your journey begins here. Find your perfect flight.</p>
    </div>

    <div class="content">

        <h2>Flight Search Results</h2>
        <p class="subtitle">
            Here are the flights matching your search.
        </p>

        <% if (listOfFlight != null && !listOfFlight.isEmpty()) { %>

            <table class="flight-table">

                <thead>
                    <tr>
                        <th>Flight Number</th>
                        <th>Source</th>
                        <th>Destination</th>
                        <th>Status</th>
                    </tr>
                </thead>

                <tbody>

                    <% for (Flight flight : listOfFlight) { %>

                        <tr>
                            <td class="flight-number">
                                <%= flight.getFlightno() %>
                            </td>

                            <td>
                                <%= flight.getFlightSource() %>
                            </td>

                            <td>
                                <%= flight.getFlightDestinatio() %>
                            </td>

                            <td>
                                <span class="status">
                                    Available
                                </span>
                            </td>
                        </tr>

                    <% } %>

                </tbody>

            </table>

        <% } else { %>

            <div class="no-flights">
                <h3>No Flights Found!</h3>
                <p>Sorry, no flights are available for your selected route.</p>
            </div>

        <% } %>

        <a href="${pageContext.request.contextPath}/" class="back-btn">
            ← Back to Search
        </a>

    </div>

    <div class="footer">
        © 2026 SkyBook. All rights reserved.
    </div>

</div>

</body>
</html>
