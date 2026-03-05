import axios from "axios";

const api = axios.create({
  baseURL: "https://secure-vote-ledger.onrender.com/api",
  headers: {
    "Content-Type": "application/json",
  },
});

export default api;
