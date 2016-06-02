angular.module('inputs', [])
.directive('inputSearch', function(){
    return{
        restrict: "AE",
        replace: true,
        transclude: true,
        scope:{
            ngModel: '@'
        },
        templateUrl: appHelper.directiveDir + '/inputs/views/input-search.html'
    }
})
