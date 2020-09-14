import React from 'react';
import './Navbar.scss';
import NavButton from './NavButton/NavButton'

const Navbar = () => {


    return (
        <div className="navbar"> {/*TODO: this kind of outside divs has to be moved to 'common' body layot that determines each div is displayed as a flex*/}
            <div className="navbar-pane">
                <NavButton to={"/account"} buttonName={"MyAccount"} />
                <NavButton to={"/booking"} buttonName={"Our offer"} />
                <NavButton to={"/about"} buttonName={"About us"} />
            </div>
        </div>


    )

}

export default Navbar;