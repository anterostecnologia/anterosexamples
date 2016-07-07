angular.module('tables', [])
.directive('basicTable', function(){
    return{
        restrict: "AE",
        transclude: true,
        scope: {
            title: '@',
        },
        templateUrl: appHelper.directiveDir +  '/tables/views/basic-table.html',
    }
})
.directive('headerTable', function(){
    return{
        restrict: "AE",
        replace:true,
        transclude: true,
        template: '<thead><tr ng-transclude></tr></thead>',
    }
})
.directive('headerColumn', function(){
    return{
        restrict: "AE",
        replace: true,
        scope: {
            value: '@'
        },
        template: '<th>{{value}}</th>',
    }
})
.directive('bodyTable', function(){
    return{
        restrict: "AE",
        transclude: true,
        replace:true,
        template: '<tbody ng-transclude></tbody>',
    }
})
.directive('lineTable', function(){
    return{
        restrict: "AE",
        replace: true,
        transclude: true,
        scope:{
            styleLine: '@',
        },
        template: '<tr class="{{styleLine}}" ng-transclude></tr>',
    }
})
.directive('lineColumn', function(){
    return{
        restrict: "AE",
        replace: true,
        transclude: true,
        scope: {
            value: '@',
        },
        template: '<th scope="row" ng-transclude>{{value}}</th>',
    }
});
