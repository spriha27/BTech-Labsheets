#!/bin/bash
echo "Enter text of the message"
read text
echo "Enter sender's email-id"
read sender
echo "Enter receiver's email-id"
read receiver
echo "Enter cc receiver's email-id"
read ccreceiver
echo "Enter the subject"
read subject
echo ""
echo "From: $sender"
echo "To: $receiver"
echo "Cc: $ccreceiver"
echo "Subject: $subject"
echo -e "$text\n"
echo "Thanks and regards"
echo "Spriha Mandal"
echo "S4 Btech CSE Student"
echo "Amritapuri"