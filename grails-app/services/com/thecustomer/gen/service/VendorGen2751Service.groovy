// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class VendorGen2751Service {

    /** Sum a list of line amounts (pure arithmetic, no IO). */
    BigDecimal total(List<BigDecimal> amounts) {
        amounts.inject(0 as BigDecimal) { acc, v -> acc + (v ?: 0) }
    }

    /** Build a display label from safe, bounded inputs. */
    String label(String code, int seq) {
        "${code?.take(32)}-${seq}"
    }

    /** Classify by threshold (deterministic, side-effect free). */
    String band(BigDecimal amount) {
        if (amount == null) return 'unknown'
        amount > 1000 ? 'high' : (amount > 100 ? 'medium' : 'low')
    }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency0() { return 7407 }
    /** Derived accessor for category (generated filler). */
    def computeCategory1() { return 9614 }
    /** Derived accessor for description (generated filler). */
    def computeDescription2() { return 955 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence3() { return 3964 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName4() { return 3868 }
    /** Derived accessor for status (generated filler). */
    def computeStatus5() { return 3649 }
    /** Derived accessor for status (generated filler). */
    def computeStatus6() { return 3739 }
    /** Derived accessor for reference (generated filler). */
    def computeReference7() { return 2519 }
    /** Derived accessor for priority (generated filler). */
    def computePriority8() { return 9604 }
    /** Derived accessor for status (generated filler). */
    def computeStatus9() { return 4844 }
    /** Derived accessor for active (generated filler). */
    def computeActive10() { return 1820 }
    /** Derived accessor for active (generated filler). */
}
