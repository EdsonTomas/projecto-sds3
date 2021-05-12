import axios from 'axios';
import Chart from 'react-apexcharts';
import { BASE_URL } from 'utils/requests';
import { SaleSum } from 'types/sele';
import { useEffect, useState } from 'react';

type ChartData = {
    series: number[],
    labels: string[]
}


const DonutChart = () => {


    const [chartData, setChartData] = useState<ChartData>({ series: [], labels: [] });

    useEffect(() => {
        axios.get(`${BASE_URL}/sales/amount-by-seller`).then((response) => {
            const data = response.data as SaleSum[];
            const myLabels = data.map(x => x.name);
            const series = data.map(x => x.sum);
            setChartData({ series: series, labels: myLabels });
            console.log(chartData);
        })
    }, [])

    /*const mockData = {
        series: [477138, 499928, 444867, 220426, 473088],
        labels: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
    }*/

    const options = {
        legend: {
            show: true
        }
    }
    return (
        <Chart
            options={{ ...options, labels: chartData.labels }}
            series={chartData.series}
            type="donut"
            height="240"
        />
    );
}

export default DonutChart;

