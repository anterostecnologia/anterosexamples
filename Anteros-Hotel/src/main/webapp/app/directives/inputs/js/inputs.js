angular.module('inputs', [])
.directive('inputSearch', function(){
    return{
        restrict: "AE",
        replace: true,
        scope:{
        	modelo:'='
        },
        templateUrl: appHelper.directiveDir + '/inputs/views/input-search.html'
    }
})
