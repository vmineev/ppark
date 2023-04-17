import { Routes, Route } from "react-router-dom";
import styled from "styled-components";

// COMPONENT
import Dashboard from "./router/Dashboard";
import HeaderComponents from "./components/HeaderComponents";
import CalendarRouter from "./router/CalendarRouter";

const Wrapper = styled.div`
    display: flex;
`;

function App() {
    return (
        <div className="App">
            <Wrapper>
                <HeaderComponents />
                <Routes>
                    <Route path="/" />
                    <Route path="/calendar" element={<CalendarRouter />} />
                    <Route path="/dashboard" element={<Dashboard />} />
                </Routes>
            </Wrapper>
        </div>
    );
}

export default App;
