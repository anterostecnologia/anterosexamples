angular.module('dismissableAlerts', [])
.directive('dismissableAlertInfo', function(){
    return{
        restric: "AE",
        transclude: true,
        scope: {
            title: '@'
        },
        templateUrl: appHelper.directiveDir + '/alerts/views/dismissable-alert-info.html'
    }
})
.directive('dismissableAlertWarning', function(){
    return{
        restric: "AE",
        transclude: true,
        scope: {
            title: '@'
        },
        templateUrl: appHelper.directiveDir + '/alerts/views/dismissable-alert-warning.html'
    }
})
.directive('dismissableAlertDanger', function(){
    return{
        restrict: "AE",
        transclude: true,
        scope: {
            title: '@'
        },
        templateUrl: appHelper.directiveDir + '/alerts/views/dismissable-alert-danger.html'
    }
})
.directive('dismissableAlertSuccess', function(){
    return{
        restric: "AE",
        transclude: true,
        scope: {
            title: '@'
        },
        templateUrl: appHelper.directiveDir + '/alerts/views/dismissable-alert-success.html'
    }
});
