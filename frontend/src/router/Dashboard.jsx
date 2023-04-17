import styled from "styled-components";

// CHART
import BarChart from "../chart/BarChart";
import DonutChart from "../chart/DonutChart";
import RangeBarChart from "../chart/RangeBarChart";

const Dashboard_Wrapper = styled.section`
    padding: 2.2rem 5rem;
    display: flex;
    flex-wrap: wrap;
`;

function Dashboard() {
    return (
        <Dashboard_Wrapper>
            <BarChart />
            <DonutChart />
            <RangeBarChart />
        </Dashboard_Wrapper>
    );
}

export default Dashboard;
