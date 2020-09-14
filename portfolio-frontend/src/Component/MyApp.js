import React from 'react'
import {
    Router,
    Route,
    browserHistory
} from 'react-router';

import MainPage from './MainPage/MainPage'
import MyAccount from './AccountPage/AccountPage'
import BookingPage from './BookingPage/BookingPage'

import './MyApp.scss' 
import  About  from './About/About';

const MyApp = () => {

    return (
        <div >
            <Router history={browserHistory} >
                <Route path="/" component={MainPage} />
                <Route path="/account" component={MyAccount} />
                <Route path="/booking" component={BookingPage} />
                <Route path="/about" component={About} />
            </Router>
        </div>
    )
}
export default MyApp





