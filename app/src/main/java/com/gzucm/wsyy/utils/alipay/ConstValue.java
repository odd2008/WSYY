package com.gzucm.wsyy.utils.alipay;

public interface ConstValue {
	// 合作身份者id，以2088开头的16位纯数字，这个你申请支付宝签约成功后就会看见
//	public static final String PARTNER = "2088612417094800";
	//我的pid
	public static final String PARTNER = "2088022712675354";
	// 这里填写收款支付宝账号，即你付款后到账的支付宝账号
	public static final String SELLER = "13226626022";
	// 商户私钥，自助生成，即rsa_private_key.pem中去掉首行，最后一行，空格和换行最后拼成一行的字符串，
	// rsa_private_key.pem这个文件等你申请支付宝签约成功后，按照文档说明你会生成的............
	// 如果android版本太高，这里要用PKCS8格式用户私钥，不然调用不会成功的，那个格式你到时候会生成的
//	public static final String RSA_PRIVATE = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAKjSURc8j+mtHXbg873giOgcP1BmRulogShnR4I4oRJztADpVorfZzDy33Mer3kEtL/k+ZiclCB3ZfbihrKCjGbMjgnF3c114QUhPb15tcfC6vQhqbNpvF7heTeDK6IKIvpWlMAHUWGfDCngwFEgaveuY4NYWFhMsRuEoM+jj/znAgMBAAECgYB5Gq5rMdm28qWxUrvnGPx9LU5J+aSi6YHFnxkQFFmPqAqXoMuhQZN/7KpYpcmQ0cxr3/EhBinIhH5TtbqUscvPA+yQFRKIlo2iig7U7xy5PqzlccKanE0P16yaAeNK+bSm5Rg7tInsJ1fzDfmatspVch/1NB/KrfBxOohiGkwO0QJBANwU0vh6hrpGGR3CV2X/nwKxRgEMRQ+KYIdEPek4Eah2I2Y02+qDJufRnLLi4aMavePPoFeYdqXVI/r+ZW3eZjkCQQDEX9Ewgr8d+pFy8gIjwVpP1WCHPKOIGz4H+v7Cx1aGdGrlCAQPtMpjerpHDor92BLozAJ58LG34AoDgJ4tDnwfAkByOgCx5O5OehmJH5g7IWyHejkKTDL/+ONW8a1sgaRwmjiPULofwsiLo3jARA+2lyeduOLQ9BoIwlJ1cFp2purJAkEAhaOPgSv5VDWJdmgr/JlBFMNphZ9GywF/HX86kOOHhskDVgo2eVnXwgtraaAEBuxdMgBkTwf2aeQV7HxDKPaKkQJABK43wnvtzEvtOws1+MXrOZxkXD1UlrYtKbDrX+/aDMCws55rkPYoG8fpQF+ifDmsEvdDo6OoI3DDuUfhk1ZDfA==";
	public static final String RSA_PRIVATE = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAL/YgS2upkGY44Pp3yB0SSahu5s7NW9bllD2TUgoSVICRslrEaobHlLlirSUfMG4S/0deFUSn3dEpwrIm/ULOn4TtlfEqq87wWVgPH5ahuRxVrVXLW5TC7rEYGVaSzOsPq+Lbbtv910A3YIG98c2IpGtb+ursQzCkrBdY1H+YWD7AgMBAAECgYEAr4Ut6tW3VpzCy5XVhqPdqXKfak6pfNCWnkw6OKJjMpzSlsVWzAMzozRPyxdvbO1o2JN13J/FNiGhksQnq/Ix+EHyC5iAA3xVoJE4UCslxIfcIpZpei5B6TF6m+g6Lg5UB34VZOR7pDfY39gmV1/FLt9Nq5TqdsDOKpCrVhKFeUECQQDkDrycCT9P2socq3DkxBcSYzuWeK8OOcLrkLtzn2IawEugSO543hwxLWimghN5+Qq6TjsTMMWyEdmpQ5J2hYWPAkEA11nyEzvFiENARuj/pWriw0PEIkXOOvc8HEmT9fJ19aFo3LWB4dEuSKWmD7j1Hiu4DAvRTmQDzBFN+1B1y/wv1QJAYAlMp7DFNo19+yC/A7cHuDiNiUn8/dKZILXsGj6OA5HixvavZbqyyIrEvQmdxgl32QjEm8o4FkqqDDtmW/7SRQJAcPOGWrwxASV04zx2Sgbj5VL33poKbzcZ2iRlbMy9PhZo78pr00tqIURw8zIprqdzoy3XnGws6a3x3uz2vAUL+QJAP2A8ja4P0V7t2wldDgmP/Zj9bWm0uNjowvFIVoS5f8UL9/nbcLDc8jSK1sUgcZ+YJNsCpERTfHsN2oUOoCeJsw==";

	// 支付宝（RSA）公钥 ,demo自带不用改，或者用签约支付宝账号登录ms.alipay.com后，在密钥管理页面获取；或者文档上也有
	public static final String RSA_PUBLIC = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDDI6d306Q8fIfCOaTXyiUeJHkrIvYISRcc73s3vF1ZT7XN8RNPwJxo8pWaJMmvyTn9N4HQ632qJBVHf8sxHi/fEsraprwCtzvzQETrNRwVxLO5jVmRGi60j8Ue1efIlzPXV9je9mkjzOmdssymZkh2QhUrCmZYI/FCEa3/cNMW0QIDAQAB";
//	public static final String RSA_PUBLIC = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCnxj/9qwVfgoUh/y2W89L6BkRAFljhNhgPdyPuBV64bfQNN1PjbCzkIM6qRdKBoLPXmKKMiFYnkd6rAoprih3/PrQEB/VsW8OoM8fxn67UDYuyBTqA23MML9q1+ilIZwBC2AQ2UBVOrFXfFl75p6/B5KsiNG9zpgmLCUYuLkxpLQIDAQAB";
	public static final int CATEGORY_MSG = 200;
}
