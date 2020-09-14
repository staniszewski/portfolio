import React, {useEffect, useState} from 'react'
import _ from 'lodash'

const Title = () => {
    const [apiData, setApiData] = useState(null)
    useEffect(()=> {
    const handler = () => fetch("http://127.0.0.1:3000/api").then(response => response.json()).then(resData=>setApiData(resData))
    handler()
}, [])
return (<div><h1>{!_.isEmpty(apiData) ? apiData?.col1 : 'Welcome.' }</h1></div>)
}

export default Title;