angular.module('links', [])
.directive('linkText', function(){
    return{
        restrict: "AE",
        transclude: true,
        scope: {
            href: '@'
        },
        template: '<a class="alert-link" href="{{href}}" ng-transclude></a>'
    }
});
