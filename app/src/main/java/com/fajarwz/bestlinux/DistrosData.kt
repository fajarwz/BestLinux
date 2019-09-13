package com.fajarwz.bestlinux

object DistrosData {
    private val distroNames = arrayOf(
        "Best distro for beginners: Linux Mint",
        "Best Linux distro for old hardware: Ubuntu MATE",
        "Best Linux for ethical hacking: Kali Linux",
        "Linux distro for gaming: Manjaro",
        "Linux distro for programming: Debian",
        "Most beautiful Linux distro: elementary OS",
        "Linux distro for kids: Ubermix",
        "Linux distro for privacy and anonymity: Tails",
        "Linux distro for servers: CentOS",
        "Linux distro for powerful PC and laptop: Ubuntu"
        )

    private val distroDetails = arrayOf(
        "Linux Mint is one of the fastest-growing Linux distros around. It keeps challenging Ubuntu when it comes to popularity contest. Added to that, Linux Mint has established itself as a perfect replacement for Windows operating system with its nearly-perfect desktop experience. Another reason why I’m calling it the best Linux distro for a new user is its ability to provide an out-of-the-box experience to the user. It means that you don’t need to spend tons of time installing the distro and packages before you can get some real work done. It doesn’t have a heavier footprint, which is another added point.\n\n" +
                "Why is Mint best for beginners?\n" +
                "Easy-to-use Cinnamon desktop\n" +
                "Large, supportive community\n" +
                "Out-of-the-box experience\n" +
                "Access to Ubuntu software repository\n",
        "For people who believe in the importance of internet security, seeing Windows XP running around in government offices and banks is frustrating. However, we have many reliable and secure alternatives in the form of Linux distributions. While deciding the best Linux distro for outdated hardware, the low footprint and lightness is the primary factor.\n" +
                "\n" +
                "For running Linux on an older PC in 2019, I’ll recommend you to go with Ubuntu MATE. The latest 19.04 version was a minor upgrade over the 18.10 release. Depending on your preference, you can choose from tons of layout options like Mutiny, Cupertino, Traditional, Netbook, Redmond, etc. If you want a system that’s extra stable, you can go for the Ubuntu MATE 18.04 LTS release to ensure that your machine keeps getting updates for a long time.\n\n" +
                "Why choose Ubuntu MATE for old machines?\n" +
                "Tons of layout options\n" +
                "Active user community\n" +
                "Perfect performance-lightness balance\n" +
                "Ubuntu software repository access\n",
        "When it comes explicitly to the best Linux distros for ethical hacking purposes, there’s absolutely no match for Kali Linux. It comes with hundreds of useful tools that belong to different categories like vulnerability analyses, wireless attacks, web applications, exploitation tools, stress testing, forensic tools, etc. Based on Debian Testing branch, most of the packages in the distro are imported from Debian repos. The recent 2019.3 release has also marked the start of a partnership between Offensive Security and Cloudflare to ensure that updates are delivered in a more reliable manner.\n" +
                "\n" +
                "Apart from full-featured desktops, Kali can also be installed on Raspberry Pi, Ordroid, Chromebook, BeagleBone, etc. It’s also available for Android smartphones with the arrival of Kali NetHunter.\n\n" +
                "Why install Kali for ethical hacking?\n" +
                "Regular rolling release model\n" +
                "Tons of tried and tested ethical hacking tools\n" +
                "Solid Debian base\n" +
                "Vast learning resource",
        "While the 2018 version of this list of the best Linux distros mentioned Steam OS as the best choice for gaming, the latest iteration labels Manjaro Linux as the best option for gaming. Having Steam preinstalled and excellent hardware support is a great plus point on Manjaro’s side. Manjaro also ships with a hardware detection tool to make the overall graphics and driver situation clear. If that sounds like a hassle, let me tell you that it ships with graphics drivers pre-installed for Nvidia and AMD cards. The distro also provides an easy way to switch between Linux kernels to ensure a better hardware support.\n" +
                "\n" +
                "Over the past few years, Arch-based Manjaro has developed a loyal userbase that has ensured that its forums are helpful for any new user.",
        "Debian Testing branch has a vast collection of packages which have a reputation for being regularly tested, updated, and rock-solid. This stability allows a programmer to take care of the development with peace of mind. However, one should keep in mind that Debian is only recommended for programmers who have an experience of working with Linux. In case you’re a beginner, you should go with Ubuntu LTS release or some other stable Linux distro by your personal preference.",
        "Most beautiful Linux distro isn’t a criteria which can judge an operating system’s capabilities in the true sense, but it plays a major role whenever someone is choosing a new distro. Thanks to the flexibility offered by Linux ecosystem, developers can create new and appealing distros. In my opinion and experience, Ubuntu-based elementary OS is the most beautiful Linux distro which is also known for its unparalleled performance.\n" +
                "\n" +
                "This fast and open source replacement for Windows and macOS borrows some design elements from macOS. Shipping without many default Ubuntu applications, elementary OS delivers a lightweight experience as well. With its GNOME-based Pantheon desktop environment, elementary OS is deeply integrated with its applications like Plank, Epiphany, and Scratch. Overall, it can be used by experienced and beginners alike to carry out daily computing tasks.",
        "Ubermix is a kid-friendly Linux distro that I’d recommend. This free and specially-built operating system also comes with touch support, which makes it a great choice for kids who love to explore stuff using their hands. It tries to become a great tool for both students and teachers. Thanks to its 5-minute installation, 60 useful free pre-loaded applications, and 20-second recovery process, Ubermix acts as a powerful distro for students and teachers.",
        "Tails live operating system can be booted on almost any computer using a DVD or USB image. This Debian-based secure distro makes sure that all internet connections are forced to go through the Tor network. With this, you end up leaving no trace on the computer. It also comes with many cryptographic tools that help you encrypt your emails, files, and instant messaging. There are other options as well for privacy-focused minds.",
        "Can you imagine setting up a server on a Linux distro that’s known for its instability or frequent crashes in the middle of something? The answer to this question is pretty obvious. Other factors that matter are hardware support, security, power efficiency, and optimized performance. There are many free and paid options for such scenarios, and CentOS is my recommendation in this category.\n" +
                "\n" +
                "RHEL enjoys the same kind of position in the enterprise arena which is enjoyed by Ubuntu in Linux desktop world. CentOS is the way to grab RHEL benefits without spending a single fee. In other words, CentOS is community supported RHEL. As its binary compatible with RHEL and its repositories have all the tried and tested software, you can use it as your production system or server. It’s also famous as a general-purpose Linux distro.",
        "Canonical’s Ubuntu needs no introduction in the world of open source. Based on Debian architecture, Ubuntu has managed to balance stability and new features like no other distro. That’s why it enjoys unparalleled popularity. If you’re running a computer with limited hardware capability, you should try out Ubuntu flavors like Ubuntu MATE, Xubuntu, or Lubuntu.\n" +
                "\n" +
                "For powerful PCs and laptops, the flagship Ubuntu running GNOME desktop is perfect. With the introduction of Snaps, installing applications has become more comfortable. It also has a thriving user community and forums where you can find the answer to any issue. Overall, Ubuntu is a pretty capable Linux distro that lets you multitask and complete your work with efficiency."
    )

    private val distroImages = intArrayOf(
        R.drawable.linux_mint,
        R.drawable.ubuntu_mate,
        R.drawable.kali_linux,
        R.drawable.manjaro_linux,
        R.drawable.debian,
        R.drawable.elementary_os,
        R.drawable.ubermix,
        R.drawable.tails,
        R.drawable.centos,
        R.drawable.ubuntu
        )

    val listData: ArrayList<Distro>
        get() {
            val list = arrayListOf<Distro>()
            for (position in distroNames.indices) {
                val distro = Distro()
                distro.name = distroNames[position]
                distro.detail = distroDetails[position]
                distro.photo = distroImages[position]
                list.add(distro)
            }
            return list
        }
}