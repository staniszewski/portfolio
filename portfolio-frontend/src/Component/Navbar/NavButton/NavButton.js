import React from 'react';
import PropTypes from 'prop-types';
import { withRouter, browserHistory } from 'react-router'
import Button from '@material-ui/core/Button'

const NavButton = ({ to, buttonName }) => {
    return (
        <Button onClick={() => browserHistory.push(to)}>
            {buttonName}
        </Button>
    )
}

NavButton.propTypes = {
    to: PropTypes.string.isRequired,
    buttonName: PropTypes.string.isRequired
}


export default withRouter(NavButton);