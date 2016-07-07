angular.module('PilukuApp').controller('HotelController',
		function($scope, $http) {
			$scope.hoteis = [];
			$scope.filtro = '';
			$http.get('/Anteros-Hotel/hotel/').success(function(hotel) {
				$scope.hoteis = hotel;
			}).error(function(erro) {
				console.log(erro);
			});
		});
